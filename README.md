# 🚀 JWT Mock Load Test Project

![GitHub repo size](https://img.shields.io/github/repo-size/SyBeRGEN/jwt-mock-loadtest)
![GitHub last commit](https://img.shields.io/github/last-commit/SyBeRGEN/jwt-mock-loadtest)
![GitHub issues](https://img.shields.io/github/issues/SyBeRGEN/jwt-mock-loadtest)
![GitHub license](https://img.shields.io/github/license/SyBeRGEN/jwt-mock-loadtest)

Микросервис-заглушка для авторизации на **Spring Boot** + нагрузочное тестирование в **JMeter** + мониторинг через **Prometheus**, **InfluxDB**, **Grafana**.

---

## 📁 Содержимое проекта

| Путь                | Описание                                                 |
|---------------------|----------------------------------------------------------|
| `/src`              | Spring Boot приложение с JWT и метриками `/metrics`     |
| `jwt_mock_test.jmx` | JMeter-тесты: авторизация и работа с JWT токеном        |
| `Dockerfile`        | Docker-сборка сервиса                                    |
| `docker-compose.yml`| Поднимает InfluxDB, Grafana и приложение                 |
| `prometheus.yml`    | Конфигурация мониторинга Prometheus                      |

---

## 📦 Быстрый старт

```bash
git clone https://github.com/SyBeRGEN/jwt-mock-loadtest.git
cd jwt-mock-loadtest
docker-compose up --build
