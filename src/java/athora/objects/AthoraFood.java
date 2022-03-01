package athora.objects;

public class AthoraFood extends AthoraInvItem {

    private final long saturation;

    public AthoraFood(String name, String type, boolean accessible, long mass, long damage, long saturation) {
        super(name, type, accessible, mass, damage);
        this.saturation = saturation;
    }

    public long getSaturation() {
        return saturation;
    }

}
