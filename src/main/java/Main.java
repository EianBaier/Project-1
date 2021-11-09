import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH);
        }).start(9000);


        app.post("/add", context -> {
             String add1 = context.formParam("add1");
            String add2 = context.formParam("add2");

            double a1 = Double.parseDouble(add1);
            double a2 = Double.parseDouble(add2);

            double  sum = a1 + a2;
            String sumString = String.valueOf(sum);

            context.result(sumString);

        });

        app.post("/sub", context -> {
            String sub1 = context.formParam("sub1");
            String sub2 = context.formParam("sub2");

            double s1 = Double.parseDouble(sub1);
            double s2 = Double.parseDouble(sub2);

            double diff = s1 - s2;
            String diffString = String.valueOf(diff);

            context.result(diffString);

        });

        app.post("/mlt", context -> {
            String mlt1 = context.formParam("mlt1");
            String mlt2 = context.formParam("mlt2");

            double m1 = Double.parseDouble(mlt1);
            double m2 = Double.parseDouble(mlt2);

            double product = m1 * m2;
            String productString = String.valueOf(product);

            context.result(productString);

        });

        app.post("/div", context -> {
            String div1 = context.formParam("div1");
            String div2 = context.formParam("div2");

            double d1 = Double.parseDouble(div1);
            double d2 = Double.parseDouble(div2);

            double dividend = d1/d2;
            String dividendString = String.valueOf(dividend);

            context.result(dividendString);

        });





    }
}
