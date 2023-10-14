package cennos;

import arc.graphics.Color;
import mindustry.content.Items;
import mindustry.content.Planets;
import mindustry.game.Team;
import mindustry.graphics.Pal;
import mindustry.graphics.g3d.HexMesh;
import mindustry.graphics.g3d.HexSkyMesh;
import mindustry.graphics.g3d.MultiMesh;
import mindustry.maps.planet.SerpuloPlanetGenerator;
import mindustry.mod.Mod;
import mindustry.type.Planet;

/**
 * CennosMod
 */
public class CennosMod extends Mod {
    CennosContent cennosContent;
    
    public CennosMod(){

    }

    @Override
    public void loadContent(){
        cennosContent.load();
    }
}