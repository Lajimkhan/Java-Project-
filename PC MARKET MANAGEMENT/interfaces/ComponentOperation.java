package interfaces;
import classes.*;
public interface ComponentOperation{
	public void insertComponent(Component c);
	public void removeComponent(Component c);
	public void showAllComponent();
	public Component SearchComponent(String cid);
}