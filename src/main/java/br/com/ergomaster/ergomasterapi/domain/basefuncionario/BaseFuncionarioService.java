package br.com.ergomaster.ergomasterapi.domain.basefuncionario;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Service
public class BaseFuncionarioService {

    @Autowired
    private BaseFuncionarioRepository repository;

    public void importarExcel(MultipartFile file) throws Exception {
        try (Workbook workbook = new XSSFWorkbook(file.getInputStream())) {
            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) { // pula o cabeçalho
                Row row = sheet.getRow(i);
                if (row == null) continue;

                BaseFuncionario funcionario = new BaseFuncionario();
                funcionario.setMatricula(getCellString(row, 0));
                funcionario.setDv(getCellString(row, 1));
                funcionario.setNome(getCellString(row, 2));
                funcionario.setCargoDescricao(getCellString(row, 3));
                funcionario.setCentroCusto(getCellString(row, 4));
                funcionario.setCentroCustoDescricao(getCellString(row, 5));
                funcionario.setSexo(getCellString(row, 6));
                funcionario.setIdFederal(getCellString(row, 7));
                funcionario.setIdentidade(getCellString(row, 8));
                funcionario.setDataNascimento(getCellDate(row, 9));
                funcionario.setNomeMae(getCellString(row, 10));
                funcionario.setDataAdmissao(getCellDate(row, 11));
                funcionario.setMaoDeObraDescricao(getCellString(row, 12));
                funcionario.setEndereco(getCellString(row, 13));
                funcionario.setnEndereco(getCellString(row, 14));
                funcionario.setCep(getCellString(row, 15));
                funcionario.setBairro(getCellString(row, 16));
                funcionario.setEstadoCivil(getCellString(row, 17));
                funcionario.setTelefone(getCellString(row, 18));
                funcionario.setPis(getCellString(row, 19));
                funcionario.setTurnoDescricao(getCellString(row, 20));
                funcionario.setGrauInstrucao(getCellString(row, 21));
                funcionario.setClassifOcupacao(getCellString(row, 22));
                funcionario.setEmail(getCellString(row, 23));
                funcionario.setTerminoContrato(getCellDate(row, 24));

                repository.save(funcionario);
            }
        }
    }

    private String getCellString(Row row, int index) {
        Cell cell = row.getCell(index, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
        return cell.toString().trim();
    }

    private LocalDate getCellDate(Row row, int index) {
        Cell cell = row.getCell(index, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
        if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
            return cell.getLocalDateTimeCellValue().toLocalDate();
        }
        return null;
    }
}