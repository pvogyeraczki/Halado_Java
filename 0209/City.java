public enum City {
    BUDAPEST(1011),
    KARCAG(5300),
    LONDON(5208);

    City(int zipCode) {
        this.zipCode = zipCode;
    }

    City(City city) {
        this.zipCode =city.zipCode;
    }

    int zipCode;

    @Override
    public String toString() {
        return name() + " " + zipCode;
    }
}