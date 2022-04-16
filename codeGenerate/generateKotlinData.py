from unittest import result
import xlrd

def generateStationDataKotlin():
    book = xlrd.open_workbook(".\\stationlist.xls")
    sheet = book.sheet_by_index(0)
    resultSet = {}
    stationId= sheet.cell_value(rowx=0, colx=0)
    stationName= sheet.cell_value(rowx=0, colx=1)
    stationLatitude= sheet.cell_value(rowx=0, colx=3)
    stationLongitude= sheet.cell_value(rowx=0, colx=4)
    lineNumber= sheet.cell_value(rowx=0, colx=5)
    stationPinYingName= sheet.cell_value(rowx=0, colx=6)

    resultSet[stationId] = sheet.col_values(colx=0, start_rowx=1, end_rowx = 377)
    resultSet[stationName] = sheet.col_values(colx=1, start_rowx=1, end_rowx = 377)
    resultSet[stationLatitude] = sheet.col_values(colx=3, start_rowx=1, end_rowx = 377)
    resultSet[stationLongitude] = sheet.col_values(colx=4, start_rowx=1, end_rowx = 377)
    resultSet[lineNumber] = sheet.col_values(colx=5, start_rowx=1, end_rowx = 377)
    resultSet[stationPinYingName] = sheet.col_values(colx=6, start_rowx=1, end_rowx = 377)

    tmplineNumber = "line1"

    stationMapResult = {}

    print("mapOf(\"line1\" to mapOf(")
    for i in range(len(resultSet[stationId])):
        if resultSet[lineNumber][i] != tmplineNumber:
            tmplineNumber = resultSet[lineNumber][i]
            print("), \"" + tmplineNumber + "\" to mapOf(")
        print("\""+resultSet[stationId][i]+"\" to StationListBindingData(\""+resultSet[stationId][i]+"\",\""+resultSet[stationName][i]+"\",\""+resultSet[lineNumber][i]+"\","+str(resultSet[stationLongitude][i])+","+str(resultSet[stationLatitude][i])+","+"PatternHelper.getLineColor(\""+resultSet[lineNumber][i]+"\")),")
    print("))")

def generateLineDataKotlin():
    book = xlrd.open_workbook(".\\linelist.xls")
    sheet = book.sheet_by_index(0)
    resultSet = {}
    lineId= sheet.cell_value(rowx=0, colx=0)
    lineName= sheet.cell_value(rowx=0, colx=1)
    resultSet[lineId] = sheet.col_values(colx=0, start_rowx=1, end_rowx = 14)
    resultSet[lineName] = sheet.col_values(colx=1, start_rowx=1, end_rowx = 14)

    print("mapOf(")
    for i in range(len(resultSet[lineId])):
        print("\""+resultSet[lineId][i]+"\" to LineListBindingData(\""+resultSet[lineId][i]+"\",\""+resultSet[lineName][i]+"\", PatternHelper.getLineColor(\""+resultSet[lineId][i]+"\")),")
    print(")")

if __name__ == "__main__":
    generateLineDataKotlin()