public class MainForDirector {
    public static void main(String[] args) {
        Director director = new Director();
        director.force(new Counter() {
            @Override
            public void otchet(int k) {
                System.out.println("Отчет за " + k + " месяцев");
            }
        }, 5);
    }
}
