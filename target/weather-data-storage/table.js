// Создаем таблицу и добавляем заголовки столбцов
const tableData = JSON.parse('${json}');
const table = document.createElement("table");
const headerRow = table.insertRow();
const cityHeader = headerRow.insertCell(0);
cityHeader.innerHTML = "Город";
const latitudeHeader = headerRow.insertCell(1);
latitudeHeader.innerHTML = "Широта";
const longitudeHeader = headerRow.insertCell(2);
longitudeHeader.innerHTML = "Долгота";
const temperatureHeader = headerRow.insertCell(3);
temperatureHeader.innerHTML = "Температура";
const humidityHeader = headerRow.insertCell(4);
humidityHeader.innerHTML = "Влажность";

// Добавляем строки с данными о погоде
var data = { city: tableData.city, latitude: tableData.latitude, longitude: tableData.longitude, temperature: tableData.temperature, humidity: tableData.humidity }


for (var i = 0; i < data.length; i++) {
    var row = table.insertRow();
    var cityCell = row.insertCell(0);
    cityCell.innerHTML = data[i].city;
    var latitudeCell = row.insertCell(1);
    latitudeCell.innerHTML = data[i].latitude;
    var longitudeCell = row.insertCell(2);
    longitudeCell.innerHTML = data[i].longitude;
    var temperatureCell = row.insertCell(3);
    temperatureCell.innerHTML = data[i].temperature;
    var humidityCell = row.insertCell(4);
    humidityCell.innerHTML = data[i].humidity;
}

// Добавляем таблицу на страницу
document.body.appendChild(table);