package design.patterns.sttic.strategy;

public interface ListStrategy {
	
	public default void start(StringBuilder sb) {};
	public void addListItem(StringBuilder sb,String item);
	public default void end(StringBuilder sb) {};


}
