package homeworks.employee.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static String dateString(Date date) {

        if (date == null) {
            return null;
        }
        return sdf.format(date);
    }

    public static Date stringToDate(String dataStr) throws ParseException {
        if (dataStr == null) {
            return null;
        }
        return sdf.parse(dataStr);
    }


}
