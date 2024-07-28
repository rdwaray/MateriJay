class Hewan{

    public void makan (){
        System.out.println("Hewan makan");
    }
}

class Burung extends  Hewan {
    public void terbang (){
        System.out.println("Burung Terbang");
    }
}

class Kucing extends Hewan{
    public void mengeong(){
        System.out.println("Meoww");
    }
}