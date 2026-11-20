@echo off
chcp 65001 >nul
echo Компиляция Лабы 1...
javac helloworld/Helloworld.java main/Main.java
if %errorlevel% neq 0 goto error
echo Запуск...
java main.Main
pause
exit

:error
echo Ошибка компиляции! Проверьте код.
pause