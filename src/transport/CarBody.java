package transport;


public enum CarBody {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COUPE("Купе"),
    WAGON("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    public String translation;
    CarBody(String translation) {
        this.translation = translation;

    }

public String getTranslation() {
    return translation;
}

    public void setTranslation(String translation) {
        this.translation = translation;
    }


    @Override
    public String toString() {
        return translation;
    }
}
