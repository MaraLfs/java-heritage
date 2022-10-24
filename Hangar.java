class Hangar {

    public static void main(String[] args) {
        Car car = new Car("clio", 15000);
        Boat boat = new Boat("Queen Princess", 25000);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}