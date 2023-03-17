package is.hi.hbv202g.ass9.composite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<MathExpression>();

    public int getResults() {
        int result=1;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
    public void add(MathExpression component) {
        children.add(component);
    }
    public void remove(MathExpression component) {
        children.remove(component); }

    public List<MathExpression> getChildren() { return children;
    }
}
