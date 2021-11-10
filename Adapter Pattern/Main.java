class Main {
    public static void main (String[] args) {
        cat cat = new Meow();

        DuckSound meowAdapter = new MeowAdapter(cat);
        System.out.println("Skuek Kwek!!!");
        meowAdapter.kwek();
    }
}