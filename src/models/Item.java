package models;

import Exceptions.CustomException;
import State.State;

public class Item {
    private int id;
    private String name;
    private int price;
    private String honorary_code;
    private String state;
    private transient State statesObj;

    public void startSale() throws CustomException {
        statesObj.startSale(this);
    }

    public void ricePrice() throws CustomException {
        statesObj.ricePrice(this);
    }

    public void withdraw() throws CustomException {
        statesObj.withdraw(this);
    }

    public void giveToTheWinner() throws CustomException {
        statesObj.giveToTheWinner(this);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getHonorary_code() {
        return honorary_code;
    }

    public void setHonorary_code(String honorary_code) {
        this.honorary_code = honorary_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public State getStatesObj() {
        return statesObj;
    }

    public void setStatesObj(State statesObj) {
        this.statesObj = statesObj;
    }
}
