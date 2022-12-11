package State;

import Exceptions.CustomException;
import models.Item;

public class Sold implements State {
    @Override
    public void startSale(Item item) throws CustomException {
        throw new CustomException("нельзя начать продажу, так как товар уже продан.");
    }

    @Override
    public void ricePrice(Item item) throws CustomException {
        throw new CustomException("нельзя повысить стоимость, так как товар уже продан.");
    }

    @Override
    public void withdraw(Item item) throws CustomException {
        throw new CustomException("нельзя снять с торгов, так как товар уже продан.");
    }

    @Override
    public void giveToTheWinner(Item item) throws CustomException {
        throw new CustomException("нельзя выдать покупателю, так как товар уже выдан.");
    }
}
