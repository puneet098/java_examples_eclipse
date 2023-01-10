package design.patterns.sttic.strategy;

import java.util.List;
import java.util.function.Supplier;

public class StaticTextProcessor<LS extends ListStrategy> {

	private StringBuilder sb = new StringBuilder();
	private LS listStrategy;
	
	public StaticTextProcessor(Supplier<? extends LS> ctor) {
		listStrategy = ctor.get();
	}
	
	
	
	public void appendList(List<String> items) {
		listStrategy.start(sb);
		for(String item:items)
			listStrategy.addListItem(sb, item);
		listStrategy.end(sb);
	}
	
	public void clear() {
		sb.setLength(0);
	}

	@Override
	public String toString() {
		return sb.toString();
	}
	
	
	
}
