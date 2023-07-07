package OOPHW2;

import java.util.Arrays;

public class Render {
    public void showIndicator(Object object) {
        if (Arrays.toString(object.getClass().getInterfaces()).contains("HasHealthPoints"))  {
            System.out.printf("%s: Текущий уровень здоровья: %d, максимальный уровень здоровья: %d \n",
                    object, ((HasHealthPoints) object).getCurrentHealthPoint(), ((HasHealthPoints) object).getMaxHealthPoint());

        }
        if (Arrays.toString(object.getClass().getInterfaces()).contains("HasManaPoints"))  {
            System.out.printf("%s: Текущий уровень маны: %d, максимальный уровень маны: %d \n",
                    object, ((HasManaPoints) object).getCurrentManaPoint(), ((HasManaPoints) object).getMaxManaPoint());

        }

    }
}
