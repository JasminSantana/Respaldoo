/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import view.Reporte;
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
 *
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 */
public class Reporte_2 {
    public static void main(String[] args) {
    Connection con = AccessMySQL.getInstance().getConnection();
         JasperReportBuilder report= DynamicReports.report();
         report
        .columns(
                Columns.column("Identificador","nArticulo",DataTypes.integerType()),
                Columns.column("Nombre", "nombreArticulo", DataTypes.stringType()))
               
            .title(
                    Components.text("Listado de articulos")//titulo del pdf
                    .setHorizontalAlignment(HorizontalAlignment.CENTER))
             .pageFooter(Components.pageXofY())//muestra el umero de pagians
                 .setDataSource("SELECT nArticulo,nombreArticulo FROM articulo order by nArticulo asc",
                         con) ;    
        
        try {
            report.show();//mostrar pdf
            report.toPdf(new FileOutputStream("c:/temp/report.pdf"));//exportar
            
        } catch (DRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

}
