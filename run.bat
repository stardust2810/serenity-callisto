@ECHO ON
echo Options: [R]un, [C]lean, [V]erify, [F]ast"
set /p answer=Enter selection:
if /i "%answer:~,1%" EQU "R" mvn clean verify
if /i "%answer:~,1%" EQU "C" mvn clean
if /i "%answer:~,1%" EQU "V" mvn verify
if /i "%answer:~,1%" EQU "F" mvn clean verify -Dcucumber.options="--tags @faq"
EXIT