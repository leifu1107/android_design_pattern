package com.llf.android_design_pattern.interpreter;


/**
 * 2. 创建实现了上述接口的实体类。
 */
public class OrExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpreter(String content) {
        return expression1.interpreter(content) || expression2.interpreter(content);
    }
}
