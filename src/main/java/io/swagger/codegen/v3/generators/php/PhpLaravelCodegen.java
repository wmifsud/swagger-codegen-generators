package io.swagger.codegen.v3.generators.php;

import io.swagger.codegen.v3.CodegenType;
import io.swagger.codegen.v3.SupportingFile;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

public class PhpLaravelCodegen extends AbstractPhpCodegen {

    protected final String DEFAULT_FRAMEWORK_VERSION = "7.5";
    protected String frameworkVersion = null;

    @Override
    public String getDefaultTemplateDir() {
        return "php-laravel/" + frameworkVersion;
    }

    @Override
    public CodegenType getTag() {
        return CodegenType.SERVER;
    }

    @Override
    public String getName() {
        return "php-laravel";
    }

    @Override
    public String getHelp() {
        return "Generates a PHP Laravel rest server application.";
    }

    @Override
    public void processOpts() {
        frameworkVersion = DEFAULT_FRAMEWORK_VERSION;
        super.processOpts();

        // default framework root files
        supportingFiles.add(new SupportingFile("composer.mustache", StringUtils.EMPTY, "composer.json"));
        supportingFiles.add(new SupportingFile("README.md", StringUtils.EMPTY, "README.md"));
        supportingFiles.add(new SupportingFile("artisan", StringUtils.EMPTY, "artisan"));
        supportingFiles.add(new SupportingFile("package.json", StringUtils.EMPTY, "package.json"));
        supportingFiles.add(new SupportingFile("phpunit.xml", StringUtils.EMPTY, "phpunit.xml"));
        supportingFiles.add(new SupportingFile(".env", StringUtils.EMPTY, ".env"));
        supportingFiles.add(new SupportingFile(".env.example", StringUtils.EMPTY, ".env.example"));
        supportingFiles.add(new SupportingFile("server.php", StringUtils.EMPTY, "server.php"));

        // default framework app folder files
        supportingFiles.add(new SupportingFile("app/Console/Kernel.php", "app/Console", "Kernel.php"));
        supportingFiles.add(new SupportingFile("app/Exceptions/Handler.php", "app/Exceptions", "Handler.php"));
        supportingFiles.add(new SupportingFile("app/Http/Kernel.php", "app/Http", "Kernel.php"));
        supportingFiles.add(new SupportingFile("app/Http/Controllers/Controller.php", "app/Http/Controllers", "Controller.php"));
        supportingFiles.add(new SupportingFile("app/Http/Middleware/Authenticate.php", "app/Http/Middleware", "Authenticate.php"));
        supportingFiles.add(new SupportingFile("app/Http/Middleware/CheckForMaintenanceMode.php","app/Http/Middleware", "CheckForMaintenanceMode.php"));
        supportingFiles.add(new SupportingFile("app/Http/Middleware/EncryptCookies.php", "app/Http/Middleware", "EncryptCookies.php"));
        supportingFiles.add(new SupportingFile("app/Http/Middleware/RedirectIfAuthenticated.php", "app/Http/Middleware", "RedirectIfAuthenticated.php"));
        supportingFiles.add(new SupportingFile("app/Http/Middleware/TrustProxies.php", "app/Http/Middleware", "TrustProxies.php"));
        supportingFiles.add(new SupportingFile("app/Http/Middleware/VerifyCsrfToken.php", "app/Http/Middleware", "VerifyCsrfToken.php"));
        supportingFiles.add(new SupportingFile("app/Providers/RouteServiceProvider.php", "app/Providers", "RouteServiceProvider.php"));

        // default framework boostrap folder files
        supportingFiles.add(new SupportingFile("bootstrap/cache/packages.php", "bootstrap/cache", "packages.php"));
        supportingFiles.add(new SupportingFile("bootstrap/cache/services.php", "bootstrap/cache", "services.php"));
        supportingFiles.add(new SupportingFile("bootstrap/app.php", "bootstrap", "app.php"));

        // default framework config folder files
        supportingFiles.add(new SupportingFile("config/app.php", "config", "app.php"));
        supportingFiles.add(new SupportingFile("config/auth.php", "config", "auth.php"));
        supportingFiles.add(new SupportingFile("config/broadcasting.php", "config", "broadcasting.php"));
        supportingFiles.add(new SupportingFile("config/cache.php", "config", "cache.php"));
        supportingFiles.add(new SupportingFile("config/cors.php", "config", "cors.php"));
        supportingFiles.add(new SupportingFile("config/database.php", "config", "database.php"));
        supportingFiles.add(new SupportingFile("config/filesystems.php", "config", "filesystems.php"));
        supportingFiles.add(new SupportingFile("config/hashing.php", "config", "hashing.php"));
        supportingFiles.add(new SupportingFile("config/logging.php", "config", "logging.php"));
        supportingFiles.add(new SupportingFile("config/queue.php", "config", "queue.php"));
        supportingFiles.add(new SupportingFile("config/services.php", "config", "services.php"));
        supportingFiles.add(new SupportingFile("config/session.php", "config", "session.php"));
        supportingFiles.add(new SupportingFile("config/view.php", "config", "view.php"));

        // default framework public folder files
        supportingFiles.add(new SupportingFile("database/factories/packages.php", "database/factories", "packages.php"));
        supportingFiles.add(new SupportingFile("database/migrations/packages.php", "database/migrations", "packages.php"));
        supportingFiles.add(new SupportingFile("database/seeds/DatabaseSeeder.php", "database/seeds", "DatabaseSeeder.php"));

        // default framework public folder files
        supportingFiles.add(new SupportingFile("public/.htaccess", "public", ".htaccess"));
        supportingFiles.add(new SupportingFile("public/index.php", "public", "index.php"));
        supportingFiles.add(new SupportingFile("public/web.config", "public", "web.config"));

        // default framework routes folder files
        supportingFiles.add(new SupportingFile("routes/api.php", "routes", "api.php"));
        supportingFiles.add(new SupportingFile("routes/console.php", "routes", "console.php"));

        // default framework storage folder files
        supportingFiles.add(new SupportingFile("storage/app/.gitignore", "storage/app", ".gitignore"));
        supportingFiles.add(new SupportingFile("storage/app/public/.gitignore", "storage/app/public", ".gitignore"));
        supportingFiles.add(new SupportingFile("storage/framework/.gitignore", "storage/framework", ".gitignore"));
        supportingFiles.add(new SupportingFile("storage/framework/cache/.gitignore", "storage/framework/cache", ".gitignore"));
        supportingFiles.add(new SupportingFile("storage/framework/sessions/.gitignore", "storage/framework/sessions", ".gitignore"));
        supportingFiles.add(new SupportingFile("storage/framework/testing/.gitignore", "storage/framework/testing", ".gitignore"));
        supportingFiles.add(new SupportingFile("storage/framework/views/.gitignore",  "storage/framework/views", ".gitignore"));
        supportingFiles.add(new SupportingFile("storage/logs/.gitignore", "storage/logs", ".gitignore"));
    }
}
