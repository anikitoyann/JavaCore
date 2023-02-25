package homeworks.medialCenter.util;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    public static final SimpleDateFormat SDTF = new SimpleDateFormat("dd/MM/yyyy HH:mm");


    public static String dateToString(Date date) {
        return SDF.format(date);
    }
    public static String dateTimeToString(Date date) {
        return SDTF.format(date);
    }
    public static Date stringToDateTime(String dateStr) throws ParseException {
        return SDTF.parse(dateStr);

    }

    public static Date stringToDate(String dataStr) throws ParseException {
        return SDF.parse(dataStr);
    }


    public static boolean isSameDay(Date date1, Date date2) {
        return dateToString(date1).equals(dateToString(date2));
    }
}

