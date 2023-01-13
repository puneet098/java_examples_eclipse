package design.patterns.strategy;

import java.util.List;

import design.patterns.strategy.dynamic.OutputFormat;
import design.patterns.strategy.dynamic.TextProcessor;
import design.patterns.strategy.operation.Context;
import design.patterns.strategy.operation.OperationAdd;
import design.patterns.strategy.operation.OperationMultiply;
import design.patterns.strategy.operation.OperationSubstract;
import design.patterns.sttic.strategy.HTMLListStrategy;
import design.patterns.sttic.strategy.MarkDownListStrategy;
import design.patterns.sttic.strategy.StaticTextProcessor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
    	tp.appendList(List.of("liberte" , "egalite", "fraternite" ));
    	System.out.println(tp);
    	
    	tp.clear();
    	tp.setOutputFormat(OutputFormat.HTML);
    	tp.appendList(List.of("inheirtence", "encapsulation", "polymorphmism"));
    	System.out.println(tp);
        System.out.println( "Hello World!" );
        
        StaticTextProcessor<MarkDownListStrategy> tp_static = new StaticTextProcessor<>(MarkDownListStrategy::new);
        tp_static.appendList(List.of("alpha", "beta", "gamma"));
        System.out.println(tp_static);
        
        StaticTextProcessor<HTMLListStrategy> tp_static_01 = new StaticTextProcessor<>(HTMLListStrategy::new);
        tp_static_01.appendList(List.of("alpha", "beta", "gamma"));
        System.out.println(tp_static_01);
        
        
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+ context.executeStrategy(10, 5));
        
        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = "+ context.executeStrategy(10, 5));
        
        context  = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+ context.executeStrategy(10, 5));
    }
}
