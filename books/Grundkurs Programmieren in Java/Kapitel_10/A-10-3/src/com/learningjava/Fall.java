package com.learningjava;
import static com.learningjava.Geschlecht.*;

public enum Fall {
    NOMINATIV, GENITIV, DATIV, AKKUSATIV;

    /** neue, uebersichtliche Implementierung: **/
    private final static String[] ARTIKEL = {
            "der", "die", "das",
            "des", "der", "des",
            "dem", "der", "dem",
            "den", "die", "das",
            "ein", "eine", "ein",
            "eines", "einer", "eines",
            "einem", "einer", "einem",
            "einen", "eine", "ein"
    };

    public String getBestimmterArtikel(Geschlecht geschlecht) {
        return ARTIKEL[geschlecht.ordinal() + this.ordinal() * 3];
    }

    public String getUnbestimmterArtikel(Geschlecht geschlecht) {
        return ARTIKEL[12 + geschlecht.ordinal() + this.ordinal() * 3];
    }

/** meine alte unuebersichtliche Implementierung:

    public String getBestimmterArtikel(Geschlecht geschlecht) {
        switch (this) {
            case NOMINATIV:
                if (geschlecht.equals(MAENNLICH))
                    return "der";
                else if (geschlecht.equals(WEIBLICH))
                    return "die";
                else
                    return "das";
            case GENITIV:
                if (geschlecht.equals(MAENNLICH))
                    return "des";
                else if (geschlecht.equals(WEIBLICH))
                    return "der";
                else
                    return "des";
            case DATIV:
                if (geschlecht.equals(MAENNLICH))
                    return "dem";
                else if (geschlecht.equals(WEIBLICH))
                    return "der";
                else
                    return "dem";
            case AKKUSATIV:
                if (geschlecht.equals(MAENNLICH))
                    return "den";
                else if (geschlecht.equals(WEIBLICH))
                    return "die";
                else
                    return "das";
            default:
                return "ERROR";
        }
    }

    public String getUnbestimmterArtikel(Geschlecht geschlecht) {
        switch (this) {
            case NOMINATIV:
                if (geschlecht.equals(MAENNLICH))
                    return "ein";
                else if (geschlecht.equals(WEIBLICH))
                    return "eine";
                else
                    return "ein";
            case GENITIV:
                if (geschlecht.equals(MAENNLICH))
                    return "eines";
                else if (geschlecht.equals(WEIBLICH))
                    return "einer";
                else
                    return "eines";
            case DATIV:
                if (geschlecht.equals(MAENNLICH))
                    return "einem";
                else if (geschlecht.equals(WEIBLICH))
                    return "einer";
                else
                    return "einem";
            case AKKUSATIV:
                if (geschlecht.equals(MAENNLICH))
                    return "einen";
                else if (geschlecht.equals(WEIBLICH))
                    return "eine";
                else
                    return "ein";
            default:
                return "ERROR";
        }
    }
 **/


}
