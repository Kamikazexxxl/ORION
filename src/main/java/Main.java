import Dao.ExcelClientDAO;
import Dao.ExcelClientDAOImpl;
import Entities.ClientEntity;

import java.util.List;

public class Main {

    public static void main(String[] args) {
//        ExcelSession excelSession = new ExcelSession("C:/Orion/CarpetControl.xlsx");
//        Workbook workbook = excelSession.getWorkbook();
//        String firstSheet = workbook.getSheet("ковры").getRow(0).getCell(0).getStringCellValue();
//        System.out.println(firstSheet);
//        System.out.println(excelSession.getLastRow(0));
        ExcelClientDAO excelClientDAO = new ExcelClientDAOImpl();
        List <ClientEntity> clientEntityList = excelClientDAO.getListOfClients();
        System.out.println(clientEntityList.toString());
    }
}
