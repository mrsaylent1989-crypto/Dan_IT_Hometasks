package Task_1;

import java.util.List;

@FunctionalInterface
public interface SessionClouser {
    void closeSession(List<CanBeClosed> entities);
}
