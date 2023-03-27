public class Holiday implements HolidayInterface {
    private String date;
    private String name;
    private Holiday[] holidays;

    public Holiday(String date, String name) {
        this.date = date;
        this.name = name;
    }

    public Holiday(Holiday[] holidays) {
        this.holidays = holidays;
    }

     public String checkHoliday(String date) {
        for(int i = 0; i < this.holidays.length; i++) {
            if(holidays[i].getDate().equals(date)) {
                return "O feriado do dia " + date + " é: " + holidays[i].getName();
            }
        }
        return "Não existe feriado nesta data";
    }

    public void allHolidays() {
        for(int i=0; i < this.holidays.length; i++) {
            System.out.println(holidays[i].getDate() + ": " + holidays[i].getName());
        }
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

}
