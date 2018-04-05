@ECHO ON
echo Options: [R]un, [C]lean, [V]erify, [F]ast, [A]bout, [U]AT, [M]2, [P]rd, [W]ww"
set /p answer=Enter selection:
if /i "%answer:~,1%" EQU "R" mvn clean verify
if /i "%answer:~,1%" EQU "C" mvn clean
if /i "%answer:~,1%" EQU "V" mvn verify
if /i "%answer:~,1%" EQU "F" mvn clean verify -Dcucumber.options="--tags @faq"
if /i "%answer:~,1%" EQU "A" mvn clean verify -Dcucumber.options="--tags @about"
if /i "%answer:~,1%" EQU "U" mvn clean verify -Dcucumber.options="--tags @about" -Dwebdriver.base.url=https://beta-uat.hpb.gov.sg
if /i "%answer:~,1%" EQU "M" mvn clean verify -Dcucumber.options="--tags @about" -Dwebdriver.base.url=https://m2.hpb.gov.sg
if /i "%answer:~,1%" EQU "P" mvn clean verify -Dwebdriver.base.url=https://m2.hpb.gov.sg
if /i "%answer:~,1%" EQU "W" mvn clean verify -Dwebdriver.base.url=https://www.hpb.gov.sg
EXIT