
package report;

import dao.AccessMySQL;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.dynamicreports.jasper.builder.JasperReportBuilder;
import net.sf.dynamicreports.report.builder.DynamicReports;
import net.sf.dynamicreports.report.builder.column.Columns;
import net.sf.dynamicreports.report.builder.component.Components;
import net.sf.dynamicreports.report.builder.datatype.DataTypes;
import net.sf.dynamicreports.report.constant.HorizontalAlignment;
import net.sf.dynamicreports.report.exception.DRException;

/**
 *Clse que permite la creacion de un reporte
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class EjemploReporte {
    public static void main(String[] args) {
       Connection con = AccessMySQL.getInstance().getConnection();
         JasperReportBuilder report= DynamicReports.report();
         report
        .columns(
                Columns.column("Identificador","idusuario",DataTypes.integerType()),
                Columns.column("Nombre", "nombreusuario", DataTypes.stringType()),
                Columns.column("Paterno","appat", DataTypes.stringType()),
                Columns.column("Materno","apmat", DataTypes.stringType()))
            .title(
                    Components.text("Listado de usuarios")//titulo del pdf
                    .setHorizontalAlignment(HorizontalAlignment.CENTER))
             .pageFooter(Components.pageXofY())//muestra el umero de pagians
                 .setDataSource("SELECT idusuario,nombreusuario,appat,apmat FROM usuario",
                         con) ;    
        
        try {
            report.show();//mostrar pdf
            report.toPdf(new FileOutputStream("c:/temp/report.pdf"));//exportar
            
        } catch (DRException ex) {
            Logger.getLogger(EjemploReporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    
    
   
}
