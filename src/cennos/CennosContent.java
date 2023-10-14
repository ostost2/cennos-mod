package cennos;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.Planet;
import mindustry.world.Block;
import mindustry.world.blocks.distribution.Conveyor;

public class CennosContent{
    public static Planet cennos;
    public static Block accelerator;

    public static void load(){
        cennos = new Cennos();

        accelerator = new Conveyor("accelerator"){{
            requirements(Category.distribution, ItemStack.with(Items.copper, 1));
            health = 30;
            speed = 3.6f;
        }};
    }
}
