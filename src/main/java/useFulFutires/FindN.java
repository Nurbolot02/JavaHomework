package useFulFutires;

public class FindN {
    /**
     * Находить все Возможные пути как из source сделать target
     * @param source - Минимальное число
     * @param target - Максимальное число
     * @param add - Добавляемая цифра
     * @param multiplication - Умнажаемая число
     * @param way - Путь
     * @param result - результат
     * @return - все возможные пути решения
     */
    public static StringBuilder FindMinimumCommand(int source, int target, int add, int multiplication, String way, StringBuilder result){
        if (source > target){
            result.append(way);
            result.append(" - it's impossible \n");
            return new StringBuilder("it's impossible");
        }
        if (source == target) {
            result.append(way);
            result.append("\n");
            return result;
        }

        FindMinimumCommand(source + add, target, add, multiplication,way + " + k1 ", result);
        FindMinimumCommand(source * multiplication, target, add, multiplication,way + " * k2 ", result);
        return result;
    }
}
