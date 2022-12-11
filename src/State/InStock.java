package State;

import Exceptions.CustomException;
import models.Item;

public class InStock implements State {
    @Override
    public void startSale(Item item) throws CustomException {
        item.setStatesObj(new ForSale());
        System.out.println("Торги начались");
    }

    @Override
    public void ricePrice(Item item) throws CustomException {
        throw new CustomException("Нельзя продать товар так как товар еще не участвует в торгах");

    }

    @Override
    public void withdraw(Item item) throws CustomException {
        throw new CustomException("Нельзя cнять товар с торгов, который в них участвует.");
    }

    @Override
    public void giveToTheWinner(Item item) throws CustomException {
        throw new CustomException("Нельзя отдать товар напрямую со склада");
    }
}
