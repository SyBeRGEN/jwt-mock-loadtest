# JWT Mock Test Project
![GitHub repo size](https://img.shields.io/github/repo-size/SyBeRGEN/jwt-mock-loadtest)
![GitHub last commit](https://img.shields.io/github/last-commit/SyBeRGEN/jwt-mock-loadtest)
![GitHub issues](https://img.shields.io/github/issues/SyBeRGEN/jwt-mock-loadtest)
![GitHub license](https://img.shields.io/github/license/SyBeRGEN/jwt-mock-loadtest)


Локальная заглушка на Spring Boot для авторизации, нагрузочные тесты в JMeter, мониторинг через Prometheus + InfluxDB + Grafana.

## Содержимое
- `/src` — Spring Boot заглушка с метриками
- `jwt_mock_test.jmx` — нагрузочные тесты (JMeter)
- `docker-compose.yml` — инфраструктура (InfluxDB + Grafana)
- `prometheus.yml` — конфигурация Prometheus
