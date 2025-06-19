# 명령어 모음
sudo nano /etc/systemd/system/shop-service.service

설정 재로딩
sudo systemctl daemon-reload

서비스 재시작
sudo systemctl restart shop-service

자동재시작 설정
sudo systemctl enable shop-service
sudo systemctl disable shop-service

로그확인
sudo journalctl -u shop-service -f