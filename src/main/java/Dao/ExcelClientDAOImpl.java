package Dao;

import Entities.ClientEntity;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelClientDAOImpl implements ExcelClientDAO {
    private final Workbook workbook;

    public ExcelClientDAOImpl() {
        this.workbook = startSession("C:/Orion/CarpetControl.xlsx");
    }

    public  Workbook startSession(String filePath){
        try(FileInputStream fis = new FileInputStream(filePath)){

            Workbook workbook = new XSSFWorkbook(fis);
            return workbook;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    @Override
    public List<ClientEntity> getListOfClients() {
        Sheet sheet = workbook.getSheetAt(0);
        int sheetsCount = sheet.getLastRowNum();
        List<ClientEntity> clientEntityList = new ArrayList<>();

        for (int i = 1; i < sheetsCount; i++) {
            Row row = sheet.getRow(i);
            int id = (int)row.getCell(0).getNumericCellValue();
            long phoneNumber = (long)row.getCell(4).getNumericCellValue();
            String address = row.getCell(5).getStringCellValue();
            ClientEntity clientEntity = new ClientEntity(id, phoneNumber,address);
            clientEntityList.add(clientEntity);
        }


            return clientEntityList;
    }

    @Override
    public ClientEntity getClientById(int id) {
        return null;
    }
}
