from pydantic import BaseModel

class AppConfig(BaseModel):
    app_name: str = "job_agent_runtime"
