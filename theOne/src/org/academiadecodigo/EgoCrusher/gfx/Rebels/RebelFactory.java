package org.academiadecodigo.EgoCrusher.gfx.Rebels;

public class RebelFactory {

    private Rebels rebels;

    public Rebels createRebels() {
        int random = (int) (Math.random() * RebelTypes.values().length);
        RebelTypes rebelTypes = RebelTypes.values()[random];

        switch (rebelTypes) {

            case ROLOELINDO:
                rebels = new RoloELindo(RebelTypes.ROLOELINDO);
                break;

            case ZUKA:
                rebels = new Zuka(RebelTypes.ZUKA);
                break;

            case DINO:
                rebels = new Dino(RebelTypes.DINO);
                break;

            case ZEZE:
                rebels = new Zeze(RebelTypes.ZEZE);
                break;

            case CAROL:
                rebels = new Carol(RebelTypes.CAROL);
                break;

            case JOAOZINHO:
                rebels = new Joaozinho(RebelTypes.JOAOZINHO);
                break;

            case RAQUEL:
                rebels = new Raquel(RebelTypes.RAQUEL);
                break;

            case ROLO:
                rebels = new Rolo(RebelTypes.ROLO);
                break;

            case NUNO:
                rebels = new Nuno(RebelTypes.NUNO);
                break;
        }
        return rebels;
    }

    public Rebels createRebelsPadawans() {
        int random = (int) (Math.random() * RebelTypes.values().length);
        RebelTypes rebelTypes = RebelTypes.values()[random];

        switch (rebelTypes) {
            case ROLOELINDO:
                rebels = new RoloELindo(RebelTypes.ROLOELINDO);
                break;

            case ZUKA:
                rebels = new Zuka(RebelTypes.ZUKA);
                break;

            case DINO:
                rebels = new Dino(RebelTypes.DINO);
                break;

            case ZEZE:
                rebels = new Zeze(RebelTypes.ZEZE);
                break;

            case CAROL:
                rebels = new Carol(RebelTypes.CAROL);
                break;

            case JOAOZINHO:
                rebels = new Joaozinho(RebelTypes.JOAOZINHO);
                break;

        }
        return rebels;
    }

    public Rebels createRebelsJedis() {
        int random = (int) (Math.random() * RebelTypes.values().length);
        RebelTypes rebelTypes = RebelTypes.values()[random];

        switch (rebelTypes) {

            case RAQUEL:
                rebels = new Raquel(RebelTypes.RAQUEL);
                break;

            case ROLO:
                rebels = new Rolo(RebelTypes.ROLO);
                break;

            case NUNO:
                rebels = new Nuno(RebelTypes.NUNO);
                break;
        }
        return rebels;

        }

    }

