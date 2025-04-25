当然，下面是一个中文版本的 `README.md` 内容示例，适用于基于 Sa-Token 实现多登录体系的项目。你可以根据项目名称和具体模块再做适配。

---

```markdown
# 项目名称（Project Name）

本项目基于 [Sa-Token](https://sa-token.cc/) 权限认证框架构建，实现了多登录体系的统一认证与细粒度权限控制，适用于需要多角色、多空间隔离控制的复杂系统。

## 🧩 项目特点

- ✅ 支持多登录体系（如用户体系、空间体系、组织体系等）
- ✅ 支持自定义权限注解，简洁优雅地进行权限校验
- ✅ 支持角色权限校验（如 `@SaCheckRole`、`orRole` 组合权限）
- ✅ 支持权限模式切换（AND / OR 模式）
- ✅ 支持注解组合与逻辑空间隔离
- ✅ 支持 Sa-Token 全特性，如会话管理、踢人下线、临时身份等
- ✅ 可扩展集成 OAuth2、SSO、微服务等场景

## 🛠️ 技术栈

- 核心权限框架：Sa-Token
- 开发语言：Java
- 构建工具：Maven / Gradle
- 框架支持：Spring Boot / Spring Cloud（可选）
- 认证机制：Token认证（支持多种 Token 生成策略）

## 🚀 快速开始

```bash
git clone https://github.com/Jonlson/wth-saToken.git
cd your-project
mvn clean install
```

### 启动应用

```bash
# 启动主服务
java -jar target/your-project.jar
```

## 🔐 权限注解示例

```java
@SaSpaceCheckPermission("space:read")
public void readSpace() {
    // 当前会话必须拥有 space:read 权限或其他配置的角色
}
```

## 📦 多登录体系示意

```java
// 默认用户登录
StpUtil.login(1001);      

// 空间用户登录
StpKit.SPACE.login("space_abc");

// 分别获取各自的 token 信息
StpUtil.getTokenInfo();
StpKit.SPACE.getTokenInfo();
```

## 📚 相关文档

- [Sa-Token 官方文档](https://sa-token.cc/)
- [注解组合开发指南](https://sa-token.cc/doc.html#/fun/annotation)
- [多账号体系实现方案](https://sa-token.cc/doc.html#/more/many-account)

## 🤝 贡献者

欢迎提交 Issue、PR，或提出优化建议！

## 📄 License

本项目基于 MIT License 开源。
```

