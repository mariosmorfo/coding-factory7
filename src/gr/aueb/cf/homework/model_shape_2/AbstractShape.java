package gr.aueb.cf.homework.model_shape_2;

import java.io.Serializable;

public class AbstractShape implements IShape {

    private long id;

    public AbstractShape(){

    }

    public AbstractShape(AbstractShape abstractShape){
        this.id = abstractShape.id;
    }


    public AbstractShape(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return id;
    }
}
