package com.stirante.RuneChanger.model;

public enum Modifier {
    RUNE_5001(5001, "+15-90 Health"),
    RUNE_5002(5002, "+5 Armor"),
    RUNE_5003(5003, "+6 Magic Resist"),
    RUNE_5005(5005, "+9% Attack Speed"),
    RUNE_5007(5007, "+1-10% CDR"),
    RUNE_5008(5008, "+10 Adaptive", "+6 AD or 10 AP");

    private final int id;
    private final String type;
    private final String onlineName;

    Modifier(int id, String type, String onlineName) {
        this.id = id;
        this.type = type;
        this.onlineName = onlineName;
    }

    Modifier(int id, String type) {
        this(id, type, type);
    }

    /**
     * Get modifier id
     * @return modifier id
     */
    public int getId() {
        return id;
    }

    /**
     * Get modifier type name
     * @return modifier type
     */
    public String getType() {
        return type;
    }

    /**
     * Get modifier name, used to parse online pages
     * @return modifier online name
     */
    public String getOnlineName() {
        return onlineName;
    }

    /**
     * Get modifier by name
     *
     * @param name modifier
     * @return modifier
     */
    public static Modifier getByName(String name) {
        for (Modifier mod : values()) {
            if (name.startsWith(mod.onlineName)) return mod;
        }
        System.out.println(name + " not found");
        return null;
    }

    @Override
    public String toString() {
        return name() + "(" + type + ")";
    }
}
