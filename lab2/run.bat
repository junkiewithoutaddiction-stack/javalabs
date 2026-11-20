@echo off
chcp 65001 >nul
echo Компиляция Лабы 2...
javac coffee/CoffeeMachine.java main/Main.java
if %errorlevel% neq 0 goto error
echo Запуск...
java main.Main
pause
exit

:error
echo Ошибка компиляции! Проверьте код.
pause