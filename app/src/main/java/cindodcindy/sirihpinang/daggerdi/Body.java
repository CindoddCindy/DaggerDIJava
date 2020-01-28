package cindodcindy.sirihpinang.daggerdi;

import javax.inject.Inject;

public class Body {

    @Inject
    public  Body(){

    }

    @Inject
    Blood blood;

    public Blood getBlood(){
        return  blood;
    }

    public void setBlood(Blood blood){
        this.blood=blood;
    }
}
