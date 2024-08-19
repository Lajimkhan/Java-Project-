package interfaces;
import classes.*;
public interface PcShopOperation{
        public void insertShop(PcShop ps);
        public void removePcShop(PcShop ps);
        public void showAllPcShops();
        public PcShop SearchPcShop(String sid);
}