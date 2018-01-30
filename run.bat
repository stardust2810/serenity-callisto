@ECHO ON
echo Options: [R]un, [C]lean, [V]erify, [F]ast, [A]bout"
set /p answer=Enter selection:
if /i "%answer:~,1%" EQU "R" mvn clean verify
if /i "%answer:~,1%" EQU "C" mvn clean
if /i "%answer:~,1%" EQU "V" mvn verify
if /i "%answer:~,1%" EQU "F" mvn clean verify -Dcucumber.options="--tags @faq"
if /i "%answer:~,1%" EQU "A" mvn clean verify -Dcucumber.options="--tags @about"
EXIT