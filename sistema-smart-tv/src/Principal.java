public class Principal{
    public static void main(String[] args) {
        SmartTv smartv = new SmartTv();

        System.out.println("A TV está ligada? "+smartv.ligada);
        System.out.println("Volume: "+smartv.volume);
        System.out.println("Canal "+smartv.canal);

        smartv.ligar();

        System.out.println("A TV está ligada? "+smartv.ligada);
    }
}