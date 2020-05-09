package io.swagger.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("swagger.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticles(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept) 
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
            	startFuture.fail(readFile.cause());
            }
        });        		        
    }
      
    public void deployVerticles(Future<Void> startFuture) {
        
        vertx.deployVerticle("io.swagger.server.api.verticle.CancelProductOrderApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CancelProductOrderApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CancelProductOrderApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.GeographicAddressApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GeographicAddressApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GeographicAddressApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.GeographicAddressValidationApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GeographicAddressValidationApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GeographicAddressValidationApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.GeographicSiteApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("GeographicSiteApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("GeographicSiteApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.HubApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("HubApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("HubApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.NotificationApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("NotificationApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("NotificationApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.ProductApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ProductApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ProductApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.ProductOfferingQualificationApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ProductOfferingQualificationApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ProductOfferingQualificationApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.ProductOrderApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ProductOrderApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ProductOrderApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("io.swagger.server.api.verticle.QuoteApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("QuoteApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("QuoteApiVerticle : Deployment failed");
            }
        });
        
    }
}