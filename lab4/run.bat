@echo off
chcp 65001 >nul
echo Компиляция Лабы 4...
javac pcbuild/*.java main/Main.java
if %errorlevel% neq 0 goto error
echo Запуск...
java main.Main
pause
exit

:error
echo Ошибка компиляции! Проверьте код.
pause