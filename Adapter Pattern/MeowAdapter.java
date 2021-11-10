public class MeowAdapter implements DuckSound {
    private cat cat;

    public MeowAdapter(cat cat) {
        this.cat = cat;
    }

    @Override
    public void kwek() {
        cat.meow();
    }
}