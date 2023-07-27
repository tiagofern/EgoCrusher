package org.academiadecodigo.EgoCrusher.gfx.Rebels;

public enum RebelTypes {

    ROLOELINDO("padawan_roloELINDO.png"),
    ZUKA("padawan_zuka.png"),
    ZEZE("padawan_zeze.png"),
    DINO("padawan_dino.png"),
    CAROL("padawan_carol.png"),
    JOAOZINHO("padawan_joaozinho.png"),

    RAQUEL("jedi_Raquel.png"),
    NUNO("jedi_Nuno.png"),
    ROLO("jedi_Rolo.png");

    private String pic;

    RebelTypes (String pic) {
        this.pic = pic;
    }

    public String getPic() {
        return pic;
    }
}
