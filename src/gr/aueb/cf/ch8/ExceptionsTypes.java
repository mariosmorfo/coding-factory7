package gr.aueb.cf.ch8;

import java.io.IOException;

public class ExceptionsTypes {
    public static void main(String[] args) {

    }

    /*
     *  System.in.read() throws IO EXCEPTIONS
     * since a checked exception throws, it has
     * to be explicitly to be thrown in method sisgnature
     * or has to be caught
     * When this type of method/ exception maybe used?
     * when no need to handle the exception
     * Is this meaningful? No. ideally we want to handle the exception
     * not only propagate
     */
    public static char readOneChar() throws IOException {
        return (char) System.in.read();
    }

    /*
     * if we catch the exception, no need for 'throws'
     * in method signature and exception not propagate.
     * Is it a good practise, not to propagate?
     * In depends.If there is a caller, when we have to propagate.
     * If there is a client, user then we do not propagate the exception
     */
    public static char readAnotherChar() {
        try {
            return (char) System.in.read();

        } catch (IOException e) {
            System.err.println(e.getMessage());
            return ' ';
        }
    }

    /*
     *  In this type of exception we take action -- logging
     * and also rethrow the exception to propagate to the caller.
     */

    public static char readAnotherOneChar() throws IOException {

        try {
            return (char) System.in.read();

        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    public static char readAgainOneChar(char ch) throws IOException, IllegalArgumentException {

        try {
            char inputChar = (char) System.in.read();

            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
            return inputChar;
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            throw e;
        }

//        } catch (IllegalArgumentException ex1) {
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println(ex2.getMessage());
//            throw ex2;
//        }
        }
    }














